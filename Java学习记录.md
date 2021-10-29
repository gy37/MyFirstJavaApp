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
11. Java对象和类，Java作为一种面向对象语言，支持以下基本概念：多态、继承、封装、抽象、类、对象、实例、方法、重载；对象是累的一个实例，有状态和行为；类是一个模板，描述一类对象的行为和状态；
12. 一个类中的变量：局部变量，在方法、构造方法、语句块中定义的变量被成为局部变量，变量的声明和初始化都在方法中，方法结束后会自动销毁；成员变量，成员变量是定义在类中，方法之外的变量，这种变量是在创建对象的时候实例化，成员变量可以被类中的方法、构造方法、语句快访问；类变量，类变量也声明在类中，方法之外的变量，用static修饰；
13. 构造方法，每个类都有构造方法，如果没有显式的为类定义构造方法，Java编译器将为该类提供一个默认构造方法；构造方法的名称必须与类同名，一个类可以有多个构造方法；
14. 源文件声明规则，一个源文件中只能有一个public类，可以有多个非public类，源文件的名称应该和public类的类名保持一致；如果一个类定义在某个包中，那么package语句应该在源文件的首行；如果源文件包含import语句，那么应该放在package语句和类定义之间，如果没有package语句，那么import语句应该放在源文件最前面；import和package语句对源文件中定义的所有类都有效，在同一个源文件中，不能给不同的类不同的包声明；
15. Java包，包主要用来对类和接口进行分类；import语句用来提供一个路径，包括包名和类名，用来定位源文件或类；
16. Java基本数据类型，内置数据类型和引用数据类型；
   基本数据类型：byte（8位），short（16位），int（32位），long（64位），float（32位单精度），double（64位双精度），boolean（1位），char（16位）；char是一个16位的Unicode字符，最小值\u0000，最大值\uffff；
   引用类型：类似C/C++的指针，引用类型指向一个对象，指向对象的变量是引用变量，变量在声明时被指定一个特定的类型；对象、数组都是引用数据类型；所有引用类型的默认值都是null；一个引用变量可以用来引用任何与之兼容的类型；
17. Java常量，常量在程序运行时是不能被修改的，在Java中用final关键字来修饰常量，通常用大写字母表示常量；
18. Java变量类型，所有变量在使用前都必须声明；类变量，独立于方法之外的变量，用static修饰；实例变量，独立于方法之外的变量，没有static修饰；局部变量，类的方法中的变量；
19. Java局部变量，声明在方法、构造方法或语句块中；局部变量在方法、构造方法或者语句块被执行的时候创建，当执行完毕后变量会被销毁；访问修饰符不能用于局部变量；局部变量只在声明他的方法、构造方法或语句块中可见；局部变量分配在栈上，基本类型存储在栈，引用类型对象存储在堆，引用存储在栈；局部变量没有默认值，所以局部变量声明之后，必须经过初始化才能使用；
20. Java实例变量，实例变量声明在类中，在方法、构造方法和语句块之外；当一个对象被实例话之后，每个实例变量的值就跟着确定；实例变量在对象创建的时候创建，在对象销毁的时候销毁；实例变量至少应该被一个方法、构造方法或语句块引用，使得外部能够通过这些方式获取实例变量；访问修饰符可以修饰实例变量；实例变量对于类中的方法、构造方法或语句块可见；实例变量有默认值；实例变量可以通过变量名直接访问，但在静态方法及其他类中，应该使用完全限定名；
21. 类变量（静态变量），在类中以static修饰的变量，在方法之外；类只拥有类变量的一份拷贝；静态变量通常被声明为常量，通常声明为public/private，final和static类型的变量；静态变量存储子啊静态存储区；静态变量第一次访问时创建，程序结束时销毁；与实例变量有相似的可见行，大多数静态变量声明为public类型；
22. Java修饰符