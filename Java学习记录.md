### Java学习记录

1. github访问不了，通过 [这个网站](https://websites.ipaddress.com/github.com) 查询github的ip地址；然后执行命令`sudo vim /etc/hosts`，把hosts中的`github.com`对应的ip修改为刚才查到的ip地址即可
2. 类名首字母大写；方法名小写字母开头，之后每个单词首字母大写；源文件名必须和类名相同；所有的Java程序由```java public static void main(String[] args)```方法开始执行
3. Java标识符中包括$符号
4. Java修饰符用来修饰类中方法和属性，包括：
    * 访问控制修饰符：default，public，protected，private
    * 非访问控制修饰符：finial，abstract，static，synchronized
5. Java变量主要有：局部变量，类变量，成员变量
6. Java数组可以保存多个同类型的变量
7. Java枚举，枚举限制变量只能是预先设置定好的值；枚举可以单独声明或者在类里面声明；方法、变量、构造函数也可以在枚举中定义
8. Java关键字，保留字不能用于常量、变量、和任何标识符的名   
   
   | 类别 | 关键字 | 说明 |
   | ------ | ------ | ------ |
   | 访问控制 | private | 私有的 |
   | 访问控制 | protected | 受保护的 |
   | 访问控制 | public | 公开的 |
   | 访问控制 | default | 默认的 |
   <table>
       <tr>
           <th>类别</th><th>关键字</th><th>说明</th>
       </tr>
       <tr>
           <td rowspan="4">访问控制</td>
           <td>private</td><td>私有的</td>
       </tr>
       <tr><td>protected</td><td>受保护的</td></tr>
       <tr><td>public</td><td>公开的</td></tr>
       <tr><td>default</td><td>默认的</td></tr>
       <tr>
           <td rowspan="13">类、方法和变量修饰符</td>
           <td>abstract</td><td>声明抽象</td>
       </tr>
       <tr><td>class</td><td>类</td></tr>
       <tr><td>extends</td><td>扩充，继承</td></tr>
       <tr><td>final</td><td>最终值，不可改变</td></tr>
       <tr><td>implements</td><td>实现（接口）</td></tr>
       <tr><td>interface</td><td>接口</td></tr>
       <tr><td>native</td><td>本地，原生方法（非Java实现）</td></tr>
       <tr><td>new</td><td>新建，创建</td></tr>
       <tr><td>static</td><td>静态</td></tr>
       <tr><td>strictfp</td><td>严格，精准</td></tr>
       <tr><td>synchronized</td><td>线程，同步</td></tr>
       <tr><td>transient</td><td>短暂</td></tr>
       <tr><td>volatile</td><td>易失</td></tr>
       <tr>
           <td rowspan="12">程序控制语句</td>
           <td>break</td><td>跳出循环</td>
       </tr>
       <tr><td>case</td><td>定义一个值以供switch选择</td></tr>
       <tr><td>continue</td><td>继续</td></tr>
       <tr><td>default</td><td>默认</td></tr>
       <tr><td>do</td><td>运行</td></tr>
       <tr><td>else</td><td>否则</td></tr>
       <tr><td>for</td><td>循环</td></tr>
       <tr><td>if</td><td>如果</td></tr>
       <tr><td>instanceof</td><td>实例</td></tr>
       <tr><td>return</td><td>返回</td></tr>
       <tr><td>switch</td><td>根据值选择执行</td></tr>
       <tr><td>while</td><td>循环</td></tr>
       <tr>
           <td rowspan="6">错误处理</td>
           <td>assert</td><td>断言表达式是否为真</td>
       </tr>
       <tr><td>catch</td><td>捕捉异常</td></tr>
       <tr><td>finally</td><td>有没有异常都执行</td></tr>
       <tr><td>throw</td><td>抛出一个异常对象</td></tr>
       <tr><td>throws</td><td>声明一个异常可能被抛出</td></tr>
       <tr><td>try</td><td>捕获异常</td></tr>
       <tr>
           <td rowspan="2">包相关</td>
           <td>import</td><td>引入</td>
       </tr>
       <tr><td>package</td><td>包</td></tr>
       <tr>
           <td rowspan="8">基本类型</td>
           <td>boolean</td><td>布尔型</td>
       </tr>
       <tr><td>byte</td><td>字节型</td></tr>
       <tr><td>char</td><td>字符型</td></tr>
       <tr><td>double</td><td>双精度浮点</td></tr>
       <tr><td>float</td><td>单精度浮点</td></tr>
       <tr><td>int</td><td>整型</td></tr>
       <tr><td>long</td><td>长整型</td></tr>
       <tr><td>short</td><td>短整型</td></tr>
       <tr>
           <td rowspan="3">变量引用</td>
           <td>super</td><td>父类，超类</td>
       </tr>
       <tr><td>this</td><td>本类</td></tr>
       <tr><td>void</td><td>无返回值</td></tr>
       <tr>
           <td rowspan="2">保留关键字</td>
           <td>goto</td><td>关键字</td>
       </tr>
       <tr><td>const</td><td>关键字</td></tr>
   </table>
9. Java继承，一个类可以有其他类派生；利用继承，可以重用已存在类的方法和属性，而不用重写这些代码
10. Java接口，可以理解为对象间相互通信的协议，接口在继承中扮演很重要的角色，接口只定义派生要用到的方法，具体的实现取决于派生类。
11. Java对象和类，