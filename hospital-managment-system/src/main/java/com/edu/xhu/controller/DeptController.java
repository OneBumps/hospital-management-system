package com.edu.xhu.controller;

import com.edu.xhu.pojo.dao.dto.DeptQueryDto;
import com.edu.xhu.pojo.entity.Department;
import com.edu.xhu.result.Result;
import com.edu.xhu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/department")        //定义访问路径前缀
@ResponseBody      //将数据转换为json，返回给前端   （这个类下面的所有方法返回的都是json数据）
public class DeptController {
    @Autowired//注入departmentService
    private DeptService deptService;

//    @RequestMapping(value = "/list",method = RequestMethod.GET)//定义访问的访问路径  method限制请求方式
//    public Result  list(){
//        List<Department> deptList = deptService.findDeptAll();
//        return Result.buildSuccess(100L,deptList);
//    }

    //查询所有
    @RequestMapping(value = "/list", method = RequestMethod.GET)//定义访问的访问路径  method限制请求方式
    public Result list(DeptQueryDto deptQueryDto) {
        //1.查询页面数据
        List<Department> deptList = deptService.findDeptByPage(deptQueryDto);
        //2.查询总记录数
        Long count = deptService.findDeptByPageCount(deptQueryDto);
        return Result.buildSuccess(count, deptList);
    }

    //2.增加
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(Department department) {//1.接收参数
        deptService.insertDept(department);//2.处理添加
        return Result.buildSuccess();//3.处理返回
    }

    //数据回显(根据id查询)
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public Result find(Long id) {
        Department department = deptService.findDeptById(id);
        return Result.buildSuccess(department);
    }

    //修改
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(Department department) {
        //2.处理添加
        deptService.updateDept(department);
        //3.处理返回
        return Result.buildSuccess();
    }

    //删除
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Result delete(Long id) {
        deptService.deleteDeptById(id);
        return Result.buildSuccess();
    }

}