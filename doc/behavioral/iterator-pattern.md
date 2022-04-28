# Iterator Pattern 迭代器模式

应用：用于生成各种迭代器

下面的例子是手写迭代器的案例 ，一般来说，迭代器都是内部类实现的

![image-20220418204450202](../../resources/image-20220418204450202.png)

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

![image-20220418212341251](../../resources/image-20220418212341251.png)