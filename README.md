# Design Pattern课程笔记

## 项目简介

项目源码在src下，如果想查看具体某个模式的如何运行，只要在对应目录下找到Main类并运行main函数即可，比如查看

```
- src
	- behavioral
	- creation
	- structural
```


推荐书目： 《Design Patterns Element of Reusable Object-Oriented Software》 -- by GoF

UML: Unified Modeling Language 33min34s

## Behavioral Pattern 行为模式

### Memento Pattern 备忘录模式

问题再现：

假设有一个编辑器，我们该如何解决撤销（undo）的问题？



```java
public class Editor {
	private String content;
	// ...
	public undo(){
		// TODO
	}
}
```

1. 加一个变量`private String prevContent`，储存上次输入的值 -> 只能存储一次
2. 改为加一个列表`private List<String> prevContentList`，储存一系列值 -> 但是只能储存content变量的值
3. 增加一个类`public class EditorStatus` -> 违背了oop的SRP（Single Responsibility Principle）
4. 再增加一个新类`public class History` 



![image-20220418143710504](resources/image-20220418143710504.png)

![image-20220418143822518](resources/image-20220418143822518.png)

### State Pattern 状态模式

问题再现

1. 比如ps中对工具的选择，选择画笔或者框选工具，鼠标同样的操作，但是在画布上的行为不同
2. 同样的比如UIControl，可以有TextBox，ListBox等

我们需要遵守Open Closed Principle (Open for extension, Closed for modification)

![image-20220418154047342](resources/image-20220418154047342.png)

![image-20220418154347251](resources/image-20220418154347251.png)

![image-20220418154445770](resources/image-20220418154445770.png)

### Iterator Pattern 迭代器模式

应用：用于生成各种迭代器

下面的例子是手写迭代器的案例 ，一般来说，迭代器都是内部类实现的

![image-20220418204450202](resources/image-20220418204450202.png)

### Strategy Pattern 战略模式

首先来看一组案例

ps: 感觉和前面的状态模式很相似

```java
public class ImageStorage {
	private String compressor;
	private String filter;

	public ImageStorage(String compressor, String filter) {
		this.compressor = compressor;
		this.filter = filter;
	}

	public void store(String fileName) {
		// JPEG, PNG, ...
		if (Objects.equals(compressor, "jpeg"))
			System.out.println("compressing using JPEG");
		else if (Objects.equals(compressor, "png"))
			System.out.println("compressing using PNG");

		// B&W, High Contrast, ...
		if (Objects.equals(filter, "b&w"))
			System.out.println("filtering using B&W");
		else if (Objects.equals(filter, "high-contrast"))
			System.out.println("filtering using high-contrast");
	}
}
```

![image-20220418212341251](resources/image-20220418212341251.png)

### Template Method Pattern 模板模式

可以看到，部分方法已经被抽象类实现，其实这个就是模板模式

![image-20220418221815333](resources/image-20220418221815333.png)

![image-20220418222016798](resources/image-20220418222016798.png)

### Command Pattern 命令模式

![image-20220418225959895](resources/image-20220418225959895.png)

#### 实践：包含撤销命令的设计

![image-20220419002450334](resources/image-20220419002450334.png)

### Observer Pattern 观察者模式

![image-20220419132151941](resources/image-20220419132151941.png)

mosh用图表举例，饼图会随着数据的变化而发生变化，有点像后台管理系统

![image-20220419144018859](resources/image-20220419144018859.png)

![image-20220419144124641](resources/image-20220419144124641.png)

同时也可以叫Publisher - Subscriber 模式

#### 讨论如何传输数据

#### 推送模式

这样做的缺点是，我们预设了数据的类型，如果之后更改数据类型，就会发生错误

![image-20220419152909475](resources/image-20220419152909475.png)

#### 拉取模式

从数据源拉取数据，但是这样做的缺点是增加了耦合

![image-20220419153001936](resources/image-20220419153001936.png)

### Mediator Pattern 中介模式

![image-20220420100016654](resources/image-20220420100016654.png)

![image-20220420101229406](resources/image-20220420101229406.png)

上面的太过复杂

![image-20220420101216460](resources/image-20220420101216460.png)

![image-20220420101606406](resources/image-20220420101606406.png)

### Chain of Responsibility Pattern 责任链模式

比如我们要搭建一个web服务器

![image-20220420144440145](resources/image-20220420144440145.png)

### Visitor Pattern 访问者模式

应用：比如vscode中标签高亮

![image-20220420155256645](resources/image-20220420155256645.png)

![image-20220420155709449](resources/image-20220420155709449.png)

![image-20220420155738792](resources/image-20220420155738792.png)

## Structural 结构型模式

### Composite Pattern 组合模式

PowerPoint中图形的组合

![image-20220421121547414](resources/image-20220421121547414.png)

![image-20220421121810359](resources/image-20220421121810359.png)

### Adaptor Pattern 适配器模式

![image-20220421123706091](resources/image-20220421123706091.png)

### Decorator Pattern 装饰器模式

![image-20220421125520980](resources/image-20220421125520980.png)

![image-20220421125609991](resources/image-20220421125609991.png) 

### Facade Pattern 外观设计模式

![image-20220421133730562](resources/image-20220421133730562.png)

### Flyweight Pattern 享元模式、飞锤模式

![image-20220421142431096](resources/image-20220421142431096.png)

### Bridge Pattern 桥接模式

![image-20220421145159140](resources/image-20220421145159140.png)

### Proxy Model 代理模式

主要是解决懒加载的问题

![image-20220421150239031](resources/image-20220421150239031.png)

![image-20220421152017799](resources/image-20220421152017799.png)

![image-20220421152146956](resources/image-20220421152146956.png)

![image-20220421152206991](resources/image-20220421152206991.png)

## Creational Pattern 创新型模式

### Prototype 原型

比如ppt中形状的创建，通过复制来生成新的对象

![image-20220421193717876](resources/image-20220421193717876.png)

![image-20220421193738330](resources/image-20220421193738330.png)

### Singleton 单例

### Factory Method 工厂方法

在Spring、Django中常用

![image-20220421202731600](resources/image-20220421202731600.png)

### Abstract Factory 抽象工厂

![image-20220421205332630](resources/image-20220421205332630.png)

### Builder 生成器

比如ppt导出成pdf，或者markdown导出成pdf

![image-20220421211257791](resources/image-20220421211257791.png)

![image-20220421211713585](resources/image-20220421211713585.png)

![image-20220421211739959](resources/image-20220421211739959.png)

[这是一个测试链接](doc/README.md)

[这是第二个测试](doc/hello.md)