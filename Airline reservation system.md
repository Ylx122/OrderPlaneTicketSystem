 # 飞机订票管理系统

 > 飞机订票可以方便航空公司管理和乘客订票。本系统实现机票的预定、机票的管理。
 系统功能：

 （1）信息录入：首先需要录入航班信息，每个班次一个航班号，一次可录入1个或多个航班信息，航班信息需要保存在文件中。

 （2）信息显示：打印输出的航班信息。
 
 （3）查询航班信息：可按至少3种查询方式，如空座信号、起飞时间、起飞地、目的地等。
 
 （4）订票预约：输入订票人信息，所订航班号，座位号。当订票成功后，航班信息表中座位信息要更新。
 
 （5）退票：输入订票信息，对应航班信息表中的座位信息要更新。


## 前期准备：需求分析
 1. 概要设计
 2. 详细设计
 3. 数据库设计



 ## 一、项目中类的抽取



 ### 1.1、乘客

```java
import java.util.Date;

//TODO 乘客类
public class Customer {
    private int id;                //ID
    private String customerType;   //乘客类型：成人、儿童、婴儿
    private String name;           //旅客姓名
    private String phone;          //手机号码
    private String cardId;         //身份ID
    private Date birthDate;        //生日

    //TODO getter and setter
    
}

```

 ### 1.2、航班信息

```java
//TODO 航班信息类
public class Flight {        //飞行详情类
    private String id;                   //ID
    private String planeType;            // 飞机类型
    private String departureAirport;     // 出发机场
    private String destinationAirport;   // 目的机场
    private String departureTime;        // 起飞时间

    //TODO Getter and Setter
    
}

```


 ### 1.3、订单

```java
import java.util.Set;

//TODO 订单类
public class Order {     //订单类
    private String id;             //ID
    private String jpjg;           //机票价格
    private float airPortTax;      //机场税
    private float ryf;             //燃油费
    private float hkzhx;           //航空综合险
    private float jptgx;           //机票退改险
    private float yhq;             //优惠券
    private float hszj;            //含税总价
    private Customer customers[];  //数组的形式
    private Set<Customer> customersSet;   //采用集合的形式 ——> 泛型



    //TODO Getter and Setter
    
}

```


 ## 二、分析类之间的关系


 ### 2.1、 is a



 ### 2.2、 like a



 ### 2.3、has a(关联关系)



 # 附件：
 ```java
 
}

 ```

 > 主键 在数据库中不应该具有任何业务意义
 百度主键生成器

```git
Administrator@jxxy02 MINGW32 /f/Ylx/Liwei
$ git clone https://github.com/ddk123456/OrderPlaneTicketSystem.git
```

## Java的分层架构
参考网址：
https://www.cnblogs.com/bdqnbenet/p/4924778.html

## 视频格式
.wmv
# Oracle






 # 相关工具
 ```
 https://www.zhihu.com/question/20224077
 有道笔记
 
 Oracle 辅助工具：
 1. toad  toad for oracle
  
 2. PLSQL Developrr

 ```


 # Git相关命令

```Git命令面试题总结
参考网址：https://blog.csdn.net/qq_36095679/article/details/91804051

git clone （这个是你新建本地git仓库，如已有可忽略此步）
git pull    取回远程主机某个分支的更新，再与本地的指定分支合并。
git status  查看当前状态
git add + 文件
git add -u + 路径：将修改过的被跟踪代码提交缓存
git add -A + 路径: 将修改过的未被跟踪的代码提交至缓存
git add -u com/breakyizhan/src
将 com/breakyizhan/src 目录下被跟踪的已修改过的代码提交到缓存中
git commit -m "修复XXbug"   推送修改到本地git库中
git push    把当前提交到git本地仓库的代码推送到远程主机的某个远程分之上
```
 ```Git
 一、 Git 常用命令速查
git branch 查看本地所有分支
git status 查看当前状态 
git commit 提交 
git branch -a 查看所有的分支
git branch -r 查看远程所有分支
git commit -am "init" 提交并且加注释
git remote add origin git@192.168.1.119:ndshow
git push origin master 将文件给推到服务器上 
git remote show origin 显示远程库origin里的资源 
git push origin master:develop
git push origin master:hb-dev 将本地库与服务器上的库进行关联 
git checkout --track origin/dev 切换到远程dev分支
git branch -D master develop 删除本地库develop
git checkout -b dev 建立一个新的本地分支dev
git merge origin/dev 将分支dev与当前分支进行合并
git checkout dev 切换到本地dev分支
git remote show 查看远程库
git add .
git rm 文件名(包括路径) 从git中删除指定文件
git clone git://github.com/schacon/grit.git 从服务器上将代码给拉下来
git config --list 看所有用户
git ls-files 看已经被提交的
git rm [file name] 删除一个文件
git commit -a 提交当前repos的所有的改变
git add [file name] 添加一个文件到git index
git commit -v 当你用－v参数的时候可以看commit的差异
git commit -m "This is the message describing the commit" 添加commit信息
git commit -a -a是代表add，把所有的change加到git index里然后再commit
git commit -a -v 一般提交命令
git log 看你commit的日志
git diff 查看尚未暂存的更新
git rm a.a 移除文件(从暂存区和工作区中删除)
git rm --cached a.a 移除文件(只从暂存区中删除)
git commit -m "remove" 移除文件(从Git中删除)
git rm -f a.a 强行移除修改后文件(从暂存区和工作区中删除)
git diff --cached 或 $ git diff --staged 查看尚未提交的更新
git stash push 将文件给push到一个临时空间中
git stash pop 将文件从临时空间pop下来
 ```