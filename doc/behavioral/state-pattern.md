State Pattern 状态模式

问题再现

1. 比如ps中对工具的选择，选择画笔或者框选工具，鼠标同样的操作，但是在画布上的行为不同
2. 同样的比如UIControl，可以有TextBox，ListBox等

我们需要遵守Open Closed Principle (Open for extension, Closed for modification)

![image-20220418154047342](../../resources/image-20220418154047342.png)

![image-20220418154347251](../../resources/image-20220418154347251.png)

![image-20220418154445770](../../resources/image-20220418154445770.png)