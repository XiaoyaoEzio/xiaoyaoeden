package top.xiaoyaoeden.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * 主页跳转
 * @author XiaoYao
 * @date Jan 30, 2018 3:47:37 PM 
 *  
 */
@Controller
public class HomePageController {
    /**
     * 跳转到购物页面
     * @return
     */
    @RequestMapping("toShop")
    public String toShop() {
        return "shop";
    }
    
    /**
     * 跳转到游戏页面
     * @return
     */
    @RequestMapping("toGame")
    public String toGame() {
        return "game";
    }
    
    /**
     * 跳转到留言板页面
     * @return
     */
    @RequestMapping("toComment")
    public String toComment() {
        return "comment";
    }
}
