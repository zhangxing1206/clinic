package cn.service;

import cn.dao.RecipeTemplateDao;
import cn.pojo.RecipeTemplate;
import cn.pojo.TemplateDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecipeTemplateService {
    @Resource
    RecipeTemplateDao recipeTemplateDao;

    public List<RecipeTemplate> getRecipeTemplate(Integer temType, Integer temPermission, String temNo, String temName){
       return recipeTemplateDao.getRecipeTemplate(temType,temPermission,temNo,temName);
    }

    public TemplateDetails getTemplateDetails(String mNo){
        return  recipeTemplateDao.getTemplateDetails(mNo);
    }



}
