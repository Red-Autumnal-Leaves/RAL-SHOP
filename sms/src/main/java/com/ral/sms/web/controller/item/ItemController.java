package com.ral.sms.web.controller.item;

import com.ral.model.query.item.ItemQuery;
import com.ral.model.res.Result;
import com.ral.sms.business.item.ItemBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by victor on 2018/2/8.
 */
@RestController
@RequestMapping("/item/*")
public class ItemController {

    @Autowired
    private ItemBusiness itemBusiness;

    /**
     * 分页查询
     * @param request
     * @param query
     * @return
     */
    @RequestMapping(value =  "/query",method = RequestMethod.GET)
    public Result query(HttpServletRequest request, ItemQuery query){
        return itemBusiness.query(request,query);
    }

    /**
     * 查询详情
     * @param request
     * @param itemCode
     * @return
     */
    @RequestMapping(value =  "/detail/{itemCode}",method = RequestMethod.GET)
    public Result detail(HttpServletRequest request,@PathVariable("itemCode")String itemCode){
        return itemBusiness.detail(request,itemCode);
    }

    /**
     * 查询商品的规格
     * @param request
     * @param itemCode
     * @return
     */
    @RequestMapping(value =  "/spec/{itemCode}",method = RequestMethod.GET)
    public Result specs(HttpServletRequest request,@PathVariable("itemCode")String itemCode){
        return itemBusiness.specs(request,itemCode);
    }

    /**
     * 查询SKU
     * @param request
     * @param itemCode
     * @return
     */
    @RequestMapping("/sku/{itemCode}")
    public Result sku(HttpServletRequest request,@PathVariable("itemCode")String itemCode){
        return itemBusiness.skus(request,itemCode);
    }

    /**
     * 移除商品规格关联
     * @param request
     * @param itemCode
     * @param specId
     * @return
     */
    @RequestMapping("/remove/{itemCode}/spec/{specId}")
    public Result removeSpec(HttpServletRequest request,@PathVariable("itemCode")String itemCode,@PathVariable("specId")Long specId){
        return itemBusiness.removeSpec(request,itemCode,specId);
    }


}
