
//jetbrains 注解
使用 implementation 'org.jetbrains:annotations-java5:15.0'
报错


```
FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:checkDebugDuplicateClasses'.
> 1 exception was raised by workers:
  java.lang.RuntimeException: java.lang.RuntimeException: Duplicate class org.intellij.lang.annotations.Flow found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.Identifier found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$AdjustableOrientation found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$BoxLayoutAxis found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$CalendarMonth found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$CursorType found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$FlowLayoutAlignment found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$FontStyle found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$HorizontalAlignment found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$InputEventMask found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$ListSelectionMode found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$PatternFlags found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$TabLayoutPolicy found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$TabPlacement found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$TitledBorderJustification found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$TitledBorderTitlePosition found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.JdkConstants$TreeSelectionMode found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.Language found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.MagicConstant found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.Pattern found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.PrintFormat found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.PrintFormatPattern found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.RegExp found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.intellij.lang.annotations.Subst found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.jetbrains.annotations.Contract found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.jetbrains.annotations.Nls found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.jetbrains.annotations.NonNls found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.jetbrains.annotations.NotNull found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.jetbrains.annotations.Nullable found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.jetbrains.annotations.PropertyKey found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  Duplicate class org.jetbrains.annotations.TestOnly found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
  
  Go to the documentation to learn how to <a href="d.android.com/r/tools/classpath-sync-errors">Fix dependency resolution errors</a>.
```

后来仔细看Gradle依赖，发现了这个依赖

implementation 'org.jetbrains:annotations-java5:15.0'
这个jar包有什么作用呢。它是用于代码检查支持和代码文档。简单来说，就是检查我们的代码的jar包。我将它替换成如下

implementation 'org.jetbrains:annotations:13.0'
万事大吉了。冲突解决了。为什么替换成它呢。我是根据上面的报错提示写的。

Duplicate class org.intellij.lang.annotations.Flow found in modules annotations-13.0.jar (org.jetbrains:annotations:13.0) and annotations-java5-15.0.jar (org.jetbrains:annotations-java5:15.0)
这句话中括号里面的就是我们所需要的依赖了。至于为什么，我想是因为gradle版本问题吧。

————————————————
原文链接：https://blog.csdn.net/zjc_null/article/details/99620519

