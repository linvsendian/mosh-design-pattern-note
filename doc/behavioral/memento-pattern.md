# Memento Pattern 备忘录模式

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



![image-20220418143710504](../../resources/image-20220418143710504.png)

![image-20220418143822518](../../resources/image-20220418143822518.png)