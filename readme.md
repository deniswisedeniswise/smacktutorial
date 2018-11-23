Smack chat example
=====

[![Build Status](https://travis-ci.org/igniterealtime/Smack.svg?branch=master)](https://travis-ci.org/igniterealtime/Smack)  [![Coverage Status](https://coveralls.io/repos/igniterealtime/Smack/badge.svg)](https://coveralls.io/r/igniterealtime/Smack)  [![Project Stats](https://www.openhub.net/p/smack/widgets/project_thin_badge.gif)](https://www.openhub.net/p/smack)  [![Visit our IRC channel](https://kiwiirc.com/buttons/irc.freenode.net/smack.png)](https://kiwiirc.com/client/irc.freenode.net/smack)

About
-----

[Smack] is an open source, highly modular, easy to use, XMPP client library written in Java for Java SE compatible JVMs and Android. This is an attempt at a simple plain old java example usage of smack library

The version of Smack we are going to use is 4.3 and its official guide is found  [Here](https://github.com/igniterealtime/Smack/wiki/Smack-4.3-Readme-and-Upgrade-Guide).

Currently, when run, it generates a runtime error
```"C:\Program Files\Java\jdk1.8.0_181\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.2.4\lib\idea_rt.jar=58152:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.2.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_181\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_181\jre\lib\rt.jar;C:\android\projects\smacktutorial-master\out\production\classes;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.igniterealtime.smack\smack-im\4.2.0\c1805ee14fe07ac65683e4b22d796d30a4171fd9\smack-im-4.2.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.igniterealtime.smack\smack-extensions\4.2.0\3bffdc845de26ab601ac9a92e53c02f8676609fe\smack-extensions-4.2.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.igniterealtime.smack\smack-core\4.2.0\b460b28484d6315dfa158af0bb9a050c92ea106f\smack-core-4.2.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.igniterealtime.smack\smack-resolver-javax\4.2.0\22a450da14833096d9ded1412352e2228f6c6f89\smack-resolver-javax-4.2.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.igniterealtime.smack\smack-sasl-javax\4.2.0\f65a3b70cb04b18c6e550b537cbc6a2937dd1e10\smack-sasl-javax-4.2.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.igniterealtime.smack\smack-tcp\4.2.0\1ebbf8b432a4d154171141dcd5aef800e43ab1cd\smack-tcp-4.2.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.jxmpp\jxmpp-core\0.5.0\f87f6947d74e7d126965b8a58a5472bbbea5f956\jxmpp-core-0.5.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.igniterealtime.smack\smack-java7\4.2.0\a7cf971057d56651d69f1744b75ae6ace12dc3ff\smack-java7-4.2.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.jxmpp\jxmpp-util-cache\0.5.0\32752e1fdf24320a2363d9b92504abf05f9b6548\jxmpp-util-cache-0.5.0.jar;C:\Users\Deo\.gradle\caches\modules-2\files-2.1\org.jxmpp\jxmpp-jid\0.5.0\eb66b23d633f6a8c01526a78507dac80afef239c\jxmpp-jid-0.5.0.jar" Main
Exception in thread "main" java.lang.NoClassDefFoundError: org/xmlpull/v1/XmlPullParserFactory
	at org.jivesoftware.smack.SmackInitialization.processConfigFile(SmackInitialization.java:158)
	at org.jivesoftware.smack.SmackInitialization.processConfigFile(SmackInitialization.java:153)
	at org.jivesoftware.smack.SmackInitialization.<clinit>(SmackInitialization.java:119)
	at org.jivesoftware.smack.SmackConfiguration.getVersion(SmackConfiguration.java:96)
	at Main.main(Main.java:16)
Caused by: java.lang.ClassNotFoundException: org.xmlpull.v1.XmlPullParserFactory
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	... 5 more
```
