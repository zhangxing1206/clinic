package cn.controller;

import cn.pojo.RecipeTemplate;
import cn.pojo.TemplateDetails;
import cn.service.RecipeTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "处方模板接口")
public class RecipeController {

    @Resource
    RecipeTemplateService recipeTemplateService;

    @ApiOperation(value = "按条件查询处方模板", notes = "按处方类别，模板权限，模板编码或模板名称查询模板")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "temType", value = "处方类别"
                    , required = false, defaultValue = "1"),
            @ApiImplicitParam(paramType = "query", name = "temPermission", value = "模板权限"
                    , required = false, defaultValue = "1"),
            @ApiImplicitParam(paramType = "query", name = "temNo", value = "模板编码"
                    , required = false, defaultValue = "RZ00001"),
            @ApiImplicitParam(paramType = "query", name = "temName", value = "模板名称"
                    , required = false, defaultValue = "")
    })

    @GetMapping("/recTem")
    @ResponseBody
    public List<RecipeTemplate> getRecipeTemplate(Integer temType, Integer temPermission, String temNo, String temName) {
        return recipeTemplateService.getRecipeTemplate(temType, temPermission, temNo, temName);
    }

    @ApiOperation(value = "按模板编码查询模板详细信息", notes = "按模板编码查询模板详细信息")
    @ApiImplicitParam(value = "模板编码", required = true, paramType = "query", defaultValue = "100001", name = "mNo")
    @GetMapping("/temDetails")
    @ResponseBody
    public TemplateDetails getTemplateDetails(String mNo) {
        return recipeTemplateService.getTemplateDetails(mNo);
    }

}
