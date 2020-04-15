package cn.controller;

import cn.pojo.TbContent;
import cn.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @RequestMapping("list")
    public List<TbContent> queryAllContent(@RequestParam("categoryId") Long categoryId){
        return contentService.queryAllContent(categoryId);
    }

}
