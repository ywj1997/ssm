package cn.itcast.controller;

import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //查询全部商品信息
    @RequestMapping("/findAll")
    public String findAll(Model model)throws Exception{
        List<Product> products = productService.findAll();
        model.addAttribute("productList", products);
        return "product-list";
    }

    //添加商品信息
    @RequestMapping("/saveProduct")
    public String saveProduct(Product product){
        System.out.println("saveProduct.......");
        productService.saveProduct(product);
        return "redirect:findAll";
    }

    //删除商品信息
    @RequestMapping("/delProduct")
    public String delProduct(Model model,Integer id){
         productService.delProduct(id);
        return "redirect:findAll";
    }
}
