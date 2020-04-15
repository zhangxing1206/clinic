package cn.service;

import cn.pojo.Cost;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CostService {

    public List<Cost> costInfo(Integer reTypeId);

}
