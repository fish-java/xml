```
javac -cp "./*" Parser.java

java -cp "./*:." Parser
```

注意：
```
java -cp "./*" Parser
Error: Could not find or load main class Parser
Caused by: java.lang.ClassNotFoundException: Parser
```
哎，javac真的坑，还好我想在debug能力强了

```
javac -cp "./*" XMLWriter.java
java -cp "./*:." XMLWriter  
```