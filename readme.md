# 图书馆管理系统
第一次springboot Git 练手
使用:spring boot;mysql;layui(vue.js);jQuery(ajax)
[详情请看基于csdn博客建立的模型](https://blog.csdn.net/Dimo__/article/details/84936685)

[layuiAPI](https://www.layui.com/doc/)

### 图书管理系统的基本功能需求
1. 书籍信息录入

**图书管理员**录入书籍的书号,名称,修改录入的出错(维护),形成**图书表**

2. 读者信息录入

**系统管理员**录入读者的个人信息,修改录入的出错(维护),形成**读者表**

3. 借阅情况录入

**图书管理员**在读者借阅图书时录入信息,修改录入的错误(维护),形成**借阅表**和**历史借阅表**

4. 计算扣款金额

**图书管理员**按读者借书时间,还书时间和借阅时长判断读者是否需要扣费,然后生成信息到**历史借阅表**中

5. 读者，图书管理员及图书信息的查询

**读者**可以根据自己的读者号查询自己的个人信息;**图书馆管理员**可以根据子的管理(员号查询自己的个人信息(包括工资);所有人都可以登录之后无条件查询图书的信息包括馆藏册数

 ### 所用表
 + 图书表
 + 读者表
 + 正借阅表
 + 读者类型表
 + 已还表
 + 工作人员表
 + 书架表
 ### 参与者
 1. 读者 2. 图书管理员 3. 系统管理院 4. 管理员父类
 ### UML分析
 ![用例图](https://img-blog.csdnimg.cn/20181210110100618.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RpbW9fXw==,size_16,color_FFFFFF,t_70)
 ![类图](https://img-blog.csdnimg.cn/20181210110100618.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RpbW9fXw==,size_16,color_FFFFFF,t_70)
 ![用户登录时序图](https://img-blog.csdnimg.cn/20181210110100610.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RpbW9fXw==,size_16,color_FFFFFF,t_70)
![还书过程时序图](https://img-blog.csdnimg.cn/20181210110100626.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RpbW9fXw==,size_16,color_FFFFFF,t_70)
![进行还书操作时的活动图](https://img-blog.csdnimg.cn/20181210110100626.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RpbW9fXw==,size_16,color_FFFFFF,t_70)
![读者从未登记到还书成功时的状态图](https://img-blog.csdnimg.cn/20181210110100644.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0RpbW9fXw==,size_16,color_FFFFFF,t_70)  
