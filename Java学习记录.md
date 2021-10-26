### Java学习记录

1. github访问不了，通过 [这个网站](https://websites.ipaddress.com/github.com) 查询github的ip地址；然后执行命令`sudo vim /etc/hosts`，把hosts中的`github.com`对应的ip修改为刚才查到的ip地址即可
2. 类名首字母大写；方法名小写字母开头，之后每个单词首字母大写；源文件名必须和类名相同；所有的Java程序由```java public static void main(String[] args)```方法开始执行
3. Java标识符中包括$符号
4. Java修饰符用来修饰类中方法和属性，包括：
    * 访问控制修饰符：default，public，protected，private
    * 非访问控制修饰符：finial，abstract，static，synchronized
5. Java变量主要有：局部变量，类变量，成员变量
6. Java数组可以保存多个同类型的变量
7. Java枚举