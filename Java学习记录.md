### 菜鸟教程

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
22. Java修饰符，分为访问修饰符和非访问修饰符；使用访问控制修饰符来保护对类、变量、方法和构造方法的访问；
23. Java有4中不同的访问权限：default默认，同一包内可见，不使用任何修饰符，用于类、接口、变量、方法；private在统一类内可见，用于变量、方法，不能修饰类；public对所有类可见，用于类、接口、变量、方法；protected对一个包内的类和所有子类可见，用于变量、方法，不能修饰类；
24. private私有访问，声明为private的方法、变量和构造方法只能被所属类访问，类和接口不能生命为private，声明为私有访问的变量只能通过类中的getter方法被外部类访问；public公开访问，声明为public的类、方法、构造方法和接口能够被其他类访问；protected受保护，子类和基类在同一个包中，protected的变量、方法和构造器能被同一个包中其他类访问，子类和积累不再同一个包中，子类实例可以访问从积累继承的protected方法，不能访问积累实例的protected方法；
25. 父类的public的方法在子类中也必须为public；父类的protected方法在子类中可以为protected或public，不能为private；父类中的private方法，不能被继承；
26. 非访问修饰符，static用来修饰类和类变量；final用来修饰类、方法和变量，final修饰的类不能被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，不可修改；abstract用来创建抽象类和抽象方法；synchronized线程锁，volatile从内存中读取值；
27. static静态变量，一个类中只有一个拷贝，静态变量也被称为类变量；静态方法不能使用类的非静态变量;
28. final变量一旦赋值后不能被重新赋值，final修饰的实例变量必须显示指定初始值；父类中的final可以被子类继承，但不能被子类重写；final类不能被继承；
29. abstract抽象类不能用来实例话对象，声明抽象类用来对该类进行扩充；一个类不能同时被abstract和final修饰，包含抽象方法的类需要声明为抽象类；抽象方法是一种没有任何实现的方法，具体实现由子类提供，抽象方法不能声明为final和static；非抽象子类需要实现抽象父类的所有抽象方法；
30. synchronized线程锁；transient不需要序列化的实例变量；volatile每次访问都重新读取变量值
31. Java运算符，算术运算符 + - * / % ++ --；关系运算符 == != > < >= <=；位运算符 & | ^ ~ << >> >>>；逻辑运算符 && || !；短路逻辑运算符 只判断逻辑运算符的某一个；赋值运算符；条件运算符；instanceof运算符；
32. Java循环结构，Java中有while，do...while，for三种循环结构；
33. Java条件语句，if...else...，switch...case...
34. Java Number&Math类，Number对基本数字类型包装成对象类型；
35. Java Character类，用于对单个字符进行操作，是基本类型char的包装类；
36. Java String类，直接创建的字符串在栈上，new创建的字符串在堆上；StringBuffer和StringBuilder类，可变字符串；StringBuffer是线程安全的，StringBuilder不是线程安全的；
37. Java数组，推荐使用dataType[] array的方式声明数组变量；使用array = new dataType[size]创建数组；声明和创建可以合并成dataType[] array = new dataType[size]；还可以用下面的方式dataType[] array = {value0, value1, ..., valuen}；
38. sout快速打印
39. Java日期时间，Date()获取当前日期时间，Date(millisec)根据时间戳获取时间，测量时间；Calendar类
40. Java正则表达式，\\表示正则表达式中的转义字符，\将下一个字符标记为特殊字符、文本、反向引用或八进制转义符，^匹配字符串开始的位置，$匹配字符串结尾的位置，*零次或多次匹配，+一次或多次匹配，?零次或一次匹配，{n}匹配n次，{n,}至少匹配n次，{n,m}至少匹配n次至多m次，?在其他限定符之后（*、+、?、{n}、{n,}、{n,m}）之后表示非贪婪匹配，.匹配除\r\n之外的任何但个字符，[]匹配指定字符集；Matcher类的对象，start和end方法返回匹配的初始索引，matches整个匹配，find查找匹配的下一个子序列，lookingAt从开始匹配，replaceFirst替换首次匹配，replaceAll替换多有匹配，appendReplacement和appendTail用于文本替换；
41. Java方法，修饰符+返回值类型+方法名+参数类型+方法体；构造方法，用来初始化对象，构造方法和类的名字相同；
42. Java流、文件、IO，read()从BufferedReader对象读取一个字符，读取一个字符串用readLine()方法，FileInputStream用于从文件读取数据，FileOutputStream用于想文件中写数据；
43. Java Scanner类，Scanner类获取用户的输入，通过Scanner类的next和nextLine方法获取输入的字符串，用hasNext和hasNextLine方法判断是否还有输入的数据，next不能得到有空格的字符串，nextLine可以得到空格；
44. Java异常处理，try...catch...用于异常捕获，用在可能发生异常的地方；throws/throw，如果一个方法没有捕获到一个检查性异常，那么该方法必须使用throws关键字来声明，也可以用throw抛出异常；finally关键字用于创建在try...catch...之后执行的代码块，无论是否发生异常，finally中的代码总会被执行；
45. Java继承，子类拥有父类非private属性、方法；子类有自己的属性和方法；子类可以重写父类的方法；继承提高了类之间的耦合性；所有类默认继承Object；extends只能继承一个类，implements可以同时实现多个接口； 
46. super关键字可以实现对父类成员的访问，用来引用当前对象的父类；this关键字指向自己，当前对象；final关键字可以把类定义为不能继承的，用于修饰方法表示不能被子类重写；
47. 子类不继承父类的构造器，只是调用；如果父类构造器带参数，则子类中的构造器必须显式的通过super调用父类的构造器；如果父类构造器没有参数，则子类的构造器中不需要使用super调用父类的构造器，系统会自动调用父类的无参数构造器；
48. Java重写与重载，重写是子类对父类允许访问的方法的实现过程进行重写，返回值和参数不能改变；重载是在一个类里面，方法名字相同而参数不同，返回类型也可以不同；方法重载是一个类的多态性表现，而方法重写是子类与父类的一种多态性表现；
49. Java多态，多态就是同一个接口，使用不同的实例而执行不同的操作；多态的实现方式，重写、接口、抽象方法和抽象类；
50. Java抽象类，有的类中没有包含足够的信息来描绘具体的对象，就叫做抽象类；抽象类不能实例话对象，只能被继承才能使用；抽象方法必须在抽象类中使用，构造方法和类方法不能声明为抽象方法；
51. Java封装，隐藏实现细节；修改属性的可见性来限制对属性的访问，对每个值属性提供对外的公共方法访问（set/get）；
52. Java接口，抽象方法的集合，通常用interface来声明；一个接口中可以有多个方法，保存在java文件中，文件名使用接口名；接口不能用于实例化对象，接口没有构造方法，接口不能包含成员变量，接口不能被继承可以被实现；接口中的方法都是隐式抽象的，默认为public abstract，接口中的变量默认为public static final；
53. Java枚举，表示一组常量，使用enum关键字定义；
54. Java包，把功能相似或相关的类或接口放在同一个包中，类似文件夹结构，可以限制包的访问权限；java.lang基础类，java.io输入输出功能；
55. Java数据结构，包括枚举、位集合、向量、栈、字典、哈希表、属性；
56. Java集合框架；
57. Java ArrayList，arraylist中的元素都是对西那个，如果使用基本类型需要使用对应的包装类；
58. Java LinkedList，