# 《Gradle+Kotlin进行Spring Boot服务端开发教程》

标题想了很多，感觉很多的标题都合适，比如:

《Kotlin + Spring Boot会不会成为一种新的选择？》

《写给Android工程师的服务端开发架构》

《打造轻量级的Java服务器框架，无需部署Tomcat，也无需部署Mysql》

《gradle + kotlin + spring boot + mybatis + sqlite 服务端开发》



## 前言
最近开始使用Kotlin语言来代替Java开发Android应用，Kotlin的语法很先进，的确是Java很好的替代品，Kotlin毕竟是Java虚拟机语言，其实最终还是编译成Java语言运用的，无法脱离Java的本身。

Gradle也是maven的替代品，拥有maven所有的功能，也拥有maven很多没有的功能。

我一直以来都是使用tomcat + springmvc + mybatis + mysql来开发服务端，这套简单的框架也非常得心应手，但是最近也有了解spring boot，既然这么流行，毕竟有过人之处。

既然Kotlin可以用来开发Android应用，那么也是可以用来开发Java服务端，一不做二不休，就尝试下Gradle+Kotlin+spring boot，对于不是专注于服务端开发的工程师，自然希望数据库的也可以简单一点，那么就用SQLite来代替Mysql。


## 架构特点
gradle + kotlin + spring boot + mybatis + sqlite组合
1. 无需安装Tomcat，直接通过main函数运行
2. 无需安装Mysql
3. 使用Kotlin语言
4. 使用Gradle代替Maven

### 面向人群
1. 学习
2. 全栈工程师，缺乏服务端开发经验，但是又需要搭建小型服务端。

### 项目功能说明
为了能够比较深刻地表达这个架构的优点，特意开发了一个客户端安装包分发平台，一方面可以提供给客户端的程序员使用，另一方面也可以增强大家对架构的理解。
[图文]功能介绍，上传（curl），下载，简单权限

提供命令行（文件路径，账号，密钥）上传


### 项目运用方式
该项目无需运行在Tomcat，只需要右击MyApplication.kt，选择命令行运行即可。但是SQLite的路径需要配置，必须写绝对路径。
[图文]


