# Story

I'm trying out the Junit 5 Quickstart
over here

https://www.testcontainers.org/quickstart/junit_5_quickstart/

I need a redis client library to see if the whole thing
really works

https://www.baeldung.com/jedis-java-redis-client-library

https://redis.io/clients#java

https://search.maven.org/classic/#search%7Cgav%7C1%7Cg%3A%22redis.clients%22%20AND%20a%3A%22jedis%22

https://search.maven.org/search?q=g:%22redis.clients%22%20AND%20a:%22jedis%22

https://search.maven.org/artifact/redis.clients/jedis/3.3.0/jar

I have added the redis client and added the test.
It currently fails as there's no redis server running
in my local.

Now checking about introducing testcontainers library
and using it

Different versions are present for it

https://search.maven.org/search?q=g:org.testcontainers%20AND%20a:testcontainers
https://search.maven.org/artifact/org.testcontainers/testcontainers/1.15.0-rc1/jar

Latest stable is 1.14.3
https://search.maven.org/artifact/org.testcontainers/testcontainers/1.14.3/jar

There are many packages / modules available under
the group org.testcontainers
https://search.maven.org/search?q=g:org.testcontainers
Look out for multiple pages. There is more than
one page of results, and around 40 results as of now!

The docs seem to be a bit out of date. As the code
has errors with latest version mentioned in the
docs - `1.14.3`

Initially I tried to just fix the compilation issues.
Later I fixed errors by checking the code of the
library. Clearly the doc needs some updation

Now, I didn't run my Docker daemon, so I got the
below error after doing what the guide said

```bash
/Library/Java/JavaVirtualMachines/openjdk.jdk/Contents/Home/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=52337:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar:/Users/karuppiahn/.m2/repository/org/junit/platform/junit-platform-launcher/1.6.2/junit-platform-launcher-1.6.2.jar:/Users/karuppiahn/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/Users/karuppiahn/.m2/repository/org/junit/platform/junit-platform-engine/1.6.2/junit-platform-engine-1.6.2.jar:/Users/karuppiahn/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/karuppiahn/.m2/repository/org/junit/platform/junit-platform-commons/1.6.2/junit-platform-commons-1.6.2.jar:/Users/karuppiahn/.m2/repository/org/junit/vintage/junit-vintage-engine/5.6.2/junit-vintage-engine-5.6.2.jar:/Users/karuppiahn/.m2/repository/junit/junit/4.13/junit-4.13.jar:/Users/karuppiahn/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Applications/IntelliJ IDEA CE.app/Contents/plugins/junit/lib/junit5-rt.jar:/Applications/IntelliJ IDEA CE.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/karuppiahn/oss/github.com/karuppiah7890/testcontainers-demo/build/classes/java/test:/Users/karuppiahn/oss/github.com/karuppiah7890/testcontainers-demo/build/classes/java/main:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/29.0-jre/801142b4c3d0f0770dd29abea50906cacfddd447/guava-29.0-jre.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/redis.clients/jedis/3.3.0/2ab3fdd2340ce84aa67765a8b8f5af05c45e06fd/jedis-3.3.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-params/5.6.2/f2a64a42cf73077062c2386db0598062b7480d91/junit-jupiter-params-5.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.testcontainers/junit-jupiter/1.14.3/5e7af4b6eaa610c17f74be47a243f1f2fc5beb92/junit-jupiter-1.14.3.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-api/5.6.2/c9ba885abfe975cda123bf6f8f0a69a1b46956d0/junit-jupiter-api-5.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.testcontainers/testcontainers/1.14.3/71fc82ba663f469447a19434e7db90f3a872753/testcontainers-1.14.3.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.guava/failureaccess/1.0.1/1dcf1de382a0bf95a3d8b0849546c88bac1292c9/failureaccess-1.0.1.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/b421526c5f297295adef1c886e5246c39d4ac629/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.code.findbugs/jsr305/3.0.2/25ea2e8b0c338a877313bd4672d3fe056ea78f0d/jsr305-3.0.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.checkerframework/checker-qual/2.11.1/8c43bf8f99b841d23aadda6044329dad9b63c185/checker-qual-2.11.1.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.errorprone/error_prone_annotations/2.3.4/dac170e4594de319655ffb62f41cbd6dbb5e601e/error_prone_annotations-2.3.4.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.j2objc/j2objc-annotations/1.3/ba035118bc8bac37d7eff77700720999acd9986d/j2objc-annotations-1.3.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.30/b5a4b6d16ab13e34a88fae84c35cd5d68cac922c/slf4j-api-1.7.30.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-pool2/2.6.2/775a8072995b29eafe8fb0a828a190589f71cede/commons-pool2-2.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.apiguardian/apiguardian-api/1.1.0/fc9dff4bb36d627bdc553de77e1f17efd790876c/apiguardian-api-1.1.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.platform/junit-platform-commons/1.6.2/7644a14b329e76b5fe487628b50fb5eab6ba7d26/junit-platform-commons-1.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.opentest4j/opentest4j/1.2.0/28c11eb91f9b6d8e200631d46e20a7f407f2a046/opentest4j-1.2.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.rnorth/tcp-unix-socket-proxy/1.0.2/cf53989130986c60113032e25185f4496ffbc186/tcp-unix-socket-proxy-1.0.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/junit/junit/4.12/2973d150c0dc1fefe998f834810d68f278ea58ec/junit-4.12.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/19.0.0/efbff6752f67a7c9de3e4251c086a88e23591dfd/annotations-19.0.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-compress/1.20/b8df472b31e1f17c232d2ad78ceb1c84e00c641b/commons-compress-1.20.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.rnorth.duct-tape/duct-tape/1.0.8/92edc22a9ab2f3e17c9bf700aaee377d50e8b530/duct-tape-1.0.8.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.rnorth.visible-assertions/visible-assertions/2.1.2/20d31a578030ec8e941888537267d3123c2ad1c1/visible-assertions-2.1.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/net.java.dev.jna/jna-platform/5.5.0/af38e7c4d0fc73c23ecd785443705bfdee5b90bf/jna-platform-5.5.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.kohlschutter.junixsocket/junixsocket-native-common/2.0.4/726bd66a934dea39c817382986496fa4eda96411/junixsocket-native-common-2.0.4.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.kohlschutter.junixsocket/junixsocket-common/2.0.4/b4d1870bf903412533e0b79c6fcd402defcfc05b/junixsocket-common-2.0.4.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.hamcrest/hamcrest-core/1.3/42a25dc3219429f0e5d060061f71acb49bf010a0/hamcrest-core-1.3.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/net.java.dev.jna/jna/5.5.0/e0845217c4907822403912ad6828d8e0b256208/jna-5.5.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.scijava/native-lib-loader/2.0.2/1451fa03954c5e31a358b411147de472b4dab92c/native-lib-loader-2.0.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-engine/5.6.2/c0833bd6de29dd77f8d071025b97b8b434308cd3/junit-jupiter-engine-5.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.platform/junit-platform-engine/1.6.2/1752cad2579e20c2b224602fe846fc660fb35805/junit-platform-engine-1.6.2.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 testcontainers.demo.RedisBackedCacheIntTestStep0
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

Aug 25, 2020 4:42:57 PM org.junit.jupiter.engine.execution.JupiterEngineExecutionContext close
SEVERE: Caught exception while closing extension context: org.junit.jupiter.engine.descriptor.MethodExtensionContext@48ae9b55
org.testcontainers.containers.ContainerLaunchException: Container startup failed
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:330)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:311)
	at org.testcontainers.junit.jupiter.TestcontainersExtension$StoreAdapter.start(TestcontainersExtension.java:242)
	at org.testcontainers.junit.jupiter.TestcontainersExtension$StoreAdapter.access$200(TestcontainersExtension.java:229)
	at org.testcontainers.junit.jupiter.TestcontainersExtension.lambda$null$4(TestcontainersExtension.java:82)
	at org.junit.jupiter.engine.execution.ExtensionValuesStore.lambda$getOrComputeIfAbsent$0(ExtensionValuesStore.java:81)
	at org.junit.jupiter.engine.execution.ExtensionValuesStore$MemoizingSupplier.get(ExtensionValuesStore.java:182)
	at org.junit.jupiter.engine.execution.ExtensionValuesStore.closeAllStoredCloseableValues(ExtensionValuesStore.java:58)
	at org.junit.jupiter.engine.descriptor.AbstractExtensionContext.close(AbstractExtensionContext.java:73)
	at org.junit.jupiter.engine.execution.JupiterEngineExecutionContext.close(JupiterEngineExecutionContext.java:53)
	at org.junit.jupiter.engine.descriptor.JupiterTestDescriptor.cleanUp(JupiterTestDescriptor.java:222)
	at org.junit.jupiter.engine.descriptor.JupiterTestDescriptor.cleanUp(JupiterTestDescriptor.java:57)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$cleanUp$9(NodeTestTask.java:151)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.cleanUp(NodeTestTask.java:151)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:83)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1510)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1510)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:248)
	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$5(DefaultLauncher.java:211)
	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:226)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:199)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:132)
	at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:71)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)
Caused by: org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=redis:5.0.3-alpine, imagePullPolicy=DefaultPullPolicy())
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1279)
	at org.testcontainers.containers.GenericContainer.logger(GenericContainer.java:613)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:320)
	... 47 more
Caused by: java.lang.IllegalStateException: Previous attempts to find a Docker environment failed. Will not retry. Please see logs and check configuration
	at org.testcontainers.dockerclient.DockerClientProviderStrategy.getFirstValidStrategy(DockerClientProviderStrategy.java:83)
	at org.testcontainers.DockerClientFactory.getOrInitializeStrategy(DockerClientFactory.java:126)
	at org.testcontainers.DockerClientFactory.client(DockerClientFactory.java:147)
	at org.testcontainers.LazyDockerClient.getDockerClient(LazyDockerClient.java:14)
	at org.testcontainers.LazyDockerClient.inspectImageCmd(LazyDockerClient.java:12)
	at org.testcontainers.images.LocalImagesCache.refreshCache(LocalImagesCache.java:42)
	at org.testcontainers.images.AbstractImagePullPolicy.shouldPull(AbstractImagePullPolicy.java:24)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:59)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:26)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:27)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1277)
	... 49 more



org.testcontainers.containers.ContainerLaunchException: Container startup failed

	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:330)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:311)
	at org.testcontainers.junit.jupiter.TestcontainersExtension$StoreAdapter.start(TestcontainersExtension.java:242)
	at org.testcontainers.junit.jupiter.TestcontainersExtension$StoreAdapter.access$200(TestcontainersExtension.java:229)
	at org.testcontainers.junit.jupiter.TestcontainersExtension.lambda$null$4(TestcontainersExtension.java:82)
	at org.junit.jupiter.engine.execution.ExtensionValuesStore.lambda$getOrComputeIfAbsent$0(ExtensionValuesStore.java:81)
	at org.junit.jupiter.engine.execution.ExtensionValuesStore$MemoizingSupplier.get(ExtensionValuesStore.java:182)
	at org.junit.jupiter.engine.execution.ExtensionValuesStore.getOrComputeIfAbsent(ExtensionValuesStore.java:84)
	at org.junit.jupiter.engine.execution.NamespaceAwareStore.getOrComputeIfAbsent(NamespaceAwareStore.java:53)
	at org.testcontainers.junit.jupiter.TestcontainersExtension.lambda$beforeEach$5(TestcontainersExtension.java:82)
	at java.base/java.util.stream.ReferencePipeline$11$1.accept(ReferencePipeline.java:441)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1624)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:274)
	at java.base/java.util.Iterator.forEachRemaining(Iterator.java:133)
	at java.base/java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceTask.doLeaf(ReduceOps.java:952)
	at java.base/java.util.stream.ReduceOps$ReduceTask.doLeaf(ReduceOps.java:926)
	at java.base/java.util.stream.AbstractTask.compute(AbstractTask.java:327)
	at java.base/java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:746)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:290)
	at java.base/java.util.concurrent.ForkJoinTask.doInvoke(ForkJoinTask.java:408)
	at java.base/java.util.concurrent.ForkJoinTask.invoke(ForkJoinTask.java:736)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateParallel(ReduceOps.java:919)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:233)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at org.testcontainers.junit.jupiter.TestcontainersExtension.beforeEach(TestcontainersExtension.java:85)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeBeforeEachCallbacks$1(TestMethodTestDescriptor.java:161)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeBeforeMethodsOrCallbacksUntilExceptionOccurs$5(TestMethodTestDescriptor.java:197)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeBeforeMethodsOrCallbacksUntilExceptionOccurs(TestMethodTestDescriptor.java:197)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeBeforeEachCallbacks(TestMethodTestDescriptor.java:160)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:131)
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:71)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:135)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1510)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1510)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:38)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$5(NodeTestTask.java:139)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$7(NodeTestTask.java:125)
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:135)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:123)
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:122)
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:80)
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:32)
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:51)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:248)
	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$5(DefaultLauncher.java:211)
	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:226)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:199)
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:132)
	at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:71)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:220)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:53)
	Suppressed: org.testcontainers.containers.ContainerLaunchException: Container startup failed
		at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:330)
		at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:311)
		at org.testcontainers.junit.jupiter.TestcontainersExtension$StoreAdapter.start(TestcontainersExtension.java:242)
		at org.testcontainers.junit.jupiter.TestcontainersExtension$StoreAdapter.access$200(TestcontainersExtension.java:229)
		at org.testcontainers.junit.jupiter.TestcontainersExtension.lambda$null$4(TestcontainersExtension.java:82)
		at org.junit.jupiter.engine.execution.ExtensionValuesStore.lambda$getOrComputeIfAbsent$0(ExtensionValuesStore.java:81)
		at org.junit.jupiter.engine.execution.ExtensionValuesStore$MemoizingSupplier.get(ExtensionValuesStore.java:182)
		at org.junit.jupiter.engine.execution.ExtensionValuesStore.closeAllStoredCloseableValues(ExtensionValuesStore.java:58)
		at org.junit.jupiter.engine.descriptor.AbstractExtensionContext.close(AbstractExtensionContext.java:73)
		at org.junit.jupiter.engine.execution.JupiterEngineExecutionContext.close(JupiterEngineExecutionContext.java:53)
		at org.junit.jupiter.engine.descriptor.JupiterTestDescriptor.cleanUp(JupiterTestDescriptor.java:222)
		at org.junit.jupiter.engine.descriptor.JupiterTestDescriptor.cleanUp(JupiterTestDescriptor.java:57)
		at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$cleanUp$9(NodeTestTask.java:151)
		at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
		at org.junit.platform.engine.support.hierarchical.NodeTestTask.cleanUp(NodeTestTask.java:151)
		at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:83)
		... 32 more
	Caused by: org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=redis:5.0.3-alpine, imagePullPolicy=DefaultPullPolicy())
		at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1279)
		at org.testcontainers.containers.GenericContainer.logger(GenericContainer.java:613)
		at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:320)
		... 47 more
	Caused by: java.lang.IllegalStateException: Previous attempts to find a Docker environment failed. Will not retry. Please see logs and check configuration
		at org.testcontainers.dockerclient.DockerClientProviderStrategy.getFirstValidStrategy(DockerClientProviderStrategy.java:83)
		at org.testcontainers.DockerClientFactory.getOrInitializeStrategy(DockerClientFactory.java:126)
		at org.testcontainers.DockerClientFactory.client(DockerClientFactory.java:147)
		at org.testcontainers.LazyDockerClient.getDockerClient(LazyDockerClient.java:14)
		at org.testcontainers.LazyDockerClient.inspectImageCmd(LazyDockerClient.java:12)
		at org.testcontainers.images.LocalImagesCache.refreshCache(LocalImagesCache.java:42)
		at org.testcontainers.images.AbstractImagePullPolicy.shouldPull(AbstractImagePullPolicy.java:24)
		at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:59)
		at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:26)
		at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
		at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:27)
		at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1277)
		... 49 more
Caused by: org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=redis:5.0.3-alpine, imagePullPolicy=DefaultPullPolicy())
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1279)
	at org.testcontainers.containers.GenericContainer.logger(GenericContainer.java:613)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:320)
	... 82 more
Caused by: java.lang.IllegalStateException: Could not find a valid Docker environment. Please see logs and check configuration
	at org.testcontainers.dockerclient.DockerClientProviderStrategy.lambda$getFirstValidStrategy$3(DockerClientProviderStrategy.java:163)
	at java.base/java.util.Optional.orElseThrow(Optional.java:401)
	at org.testcontainers.dockerclient.DockerClientProviderStrategy.getFirstValidStrategy(DockerClientProviderStrategy.java:155)
	at org.testcontainers.DockerClientFactory.getOrInitializeStrategy(DockerClientFactory.java:126)
	at org.testcontainers.DockerClientFactory.client(DockerClientFactory.java:147)
	at org.testcontainers.LazyDockerClient.getDockerClient(LazyDockerClient.java:14)
	at org.testcontainers.LazyDockerClient.listImagesCmd(LazyDockerClient.java:12)
	at org.testcontainers.images.LocalImagesCache.maybeInitCache(LocalImagesCache.java:68)
	at org.testcontainers.images.LocalImagesCache.get(LocalImagesCache.java:32)
	at org.testcontainers.images.AbstractImagePullPolicy.shouldPull(AbstractImagePullPolicy.java:18)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:59)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:26)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:20)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:27)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1277)
	... 84 more



Process finished with exit code 255
```

Wierdly, I didn't see any logs for the test run
this time. The docs says we can see some logs.
It maybe due to some logging issues

```bash
/Library/Java/JavaVirtualMachines/openjdk.jdk/Contents/Home/bin/java -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=52397:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar:/Users/karuppiahn/.m2/repository/org/junit/platform/junit-platform-launcher/1.6.2/junit-platform-launcher-1.6.2.jar:/Users/karuppiahn/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/Users/karuppiahn/.m2/repository/org/junit/platform/junit-platform-engine/1.6.2/junit-platform-engine-1.6.2.jar:/Users/karuppiahn/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/karuppiahn/.m2/repository/org/junit/platform/junit-platform-commons/1.6.2/junit-platform-commons-1.6.2.jar:/Users/karuppiahn/.m2/repository/org/junit/vintage/junit-vintage-engine/5.6.2/junit-vintage-engine-5.6.2.jar:/Users/karuppiahn/.m2/repository/junit/junit/4.13/junit-4.13.jar:/Users/karuppiahn/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Applications/IntelliJ IDEA CE.app/Contents/plugins/junit/lib/junit5-rt.jar:/Applications/IntelliJ IDEA CE.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/karuppiahn/oss/github.com/karuppiah7890/testcontainers-demo/build/classes/java/test:/Users/karuppiahn/oss/github.com/karuppiah7890/testcontainers-demo/build/classes/java/main:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/29.0-jre/801142b4c3d0f0770dd29abea50906cacfddd447/guava-29.0-jre.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/redis.clients/jedis/3.3.0/2ab3fdd2340ce84aa67765a8b8f5af05c45e06fd/jedis-3.3.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-params/5.6.2/f2a64a42cf73077062c2386db0598062b7480d91/junit-jupiter-params-5.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.testcontainers/junit-jupiter/1.14.3/5e7af4b6eaa610c17f74be47a243f1f2fc5beb92/junit-jupiter-1.14.3.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-api/5.6.2/c9ba885abfe975cda123bf6f8f0a69a1b46956d0/junit-jupiter-api-5.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.testcontainers/testcontainers/1.14.3/71fc82ba663f469447a19434e7db90f3a872753/testcontainers-1.14.3.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.guava/failureaccess/1.0.1/1dcf1de382a0bf95a3d8b0849546c88bac1292c9/failureaccess-1.0.1.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/b421526c5f297295adef1c886e5246c39d4ac629/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.code.findbugs/jsr305/3.0.2/25ea2e8b0c338a877313bd4672d3fe056ea78f0d/jsr305-3.0.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.checkerframework/checker-qual/2.11.1/8c43bf8f99b841d23aadda6044329dad9b63c185/checker-qual-2.11.1.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.errorprone/error_prone_annotations/2.3.4/dac170e4594de319655ffb62f41cbd6dbb5e601e/error_prone_annotations-2.3.4.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.google.j2objc/j2objc-annotations/1.3/ba035118bc8bac37d7eff77700720999acd9986d/j2objc-annotations-1.3.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.30/b5a4b6d16ab13e34a88fae84c35cd5d68cac922c/slf4j-api-1.7.30.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-pool2/2.6.2/775a8072995b29eafe8fb0a828a190589f71cede/commons-pool2-2.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.apiguardian/apiguardian-api/1.1.0/fc9dff4bb36d627bdc553de77e1f17efd790876c/apiguardian-api-1.1.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.platform/junit-platform-commons/1.6.2/7644a14b329e76b5fe487628b50fb5eab6ba7d26/junit-platform-commons-1.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.opentest4j/opentest4j/1.2.0/28c11eb91f9b6d8e200631d46e20a7f407f2a046/opentest4j-1.2.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.rnorth/tcp-unix-socket-proxy/1.0.2/cf53989130986c60113032e25185f4496ffbc186/tcp-unix-socket-proxy-1.0.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/junit/junit/4.12/2973d150c0dc1fefe998f834810d68f278ea58ec/junit-4.12.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/19.0.0/efbff6752f67a7c9de3e4251c086a88e23591dfd/annotations-19.0.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.apache.commons/commons-compress/1.20/b8df472b31e1f17c232d2ad78ceb1c84e00c641b/commons-compress-1.20.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.rnorth.duct-tape/duct-tape/1.0.8/92edc22a9ab2f3e17c9bf700aaee377d50e8b530/duct-tape-1.0.8.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.rnorth.visible-assertions/visible-assertions/2.1.2/20d31a578030ec8e941888537267d3123c2ad1c1/visible-assertions-2.1.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/net.java.dev.jna/jna-platform/5.5.0/af38e7c4d0fc73c23ecd785443705bfdee5b90bf/jna-platform-5.5.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.kohlschutter.junixsocket/junixsocket-native-common/2.0.4/726bd66a934dea39c817382986496fa4eda96411/junixsocket-native-common-2.0.4.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/com.kohlschutter.junixsocket/junixsocket-common/2.0.4/b4d1870bf903412533e0b79c6fcd402defcfc05b/junixsocket-common-2.0.4.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.hamcrest/hamcrest-core/1.3/42a25dc3219429f0e5d060061f71acb49bf010a0/hamcrest-core-1.3.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/net.java.dev.jna/jna/5.5.0/e0845217c4907822403912ad6828d8e0b256208/jna-5.5.0.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.scijava/native-lib-loader/2.0.2/1451fa03954c5e31a358b411147de472b4dab92c/native-lib-loader-2.0.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.jupiter/junit-jupiter-engine/5.6.2/c0833bd6de29dd77f8d071025b97b8b434308cd3/junit-jupiter-engine-5.6.2.jar:/Users/karuppiahn/.gradle/caches/modules-2/files-2.1/org.junit.platform/junit-platform-engine/1.6.2/1752cad2579e20c2b224602fe846fc660fb35805/junit-platform-engine-1.6.2.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 testcontainers.demo.RedisBackedCacheIntTestStep0
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.

SLF4J: Failed to load class "org.slf4j.impl.StaticMDCBinder".
SLF4J: Defaulting to no-operation MDCAdapter implementation.
SLF4J: See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.


Process finished with exit code 0
```

I can see slf4j errors. And slf4j seems to be a
logging thing
http://www.slf4j.org/
"Simple Logging Facade For Java"

The test passes though!! :)

Docker image for redis has been pulled of course

```bash
$ docker images redis
REPOSITORY          TAG                 IMAGE ID            CREATED             SIZE
redis               5.0.3-alpine        3d2a373f46ae        17 months ago       50.8MB
```

We can see some docker containers running too when
the tests are running

```bash
$ watch -n 1 "docker ps"
Every 1.0s: docker ps                                                   Karuppiah-N.local: Tue Aug 25 16:50:28 2020

CONTAINER ID        IMAGE                               COMMAND             CREATED             STATUS
 PORTS                     NAMES
b544411e51c2        testcontainersofficial/ryuk:0.3.0   "/app"              4 seconds ago       Up 4 seconds
 0.0.0.0:32770->8080/tcp   testcontainers-ryuk-b9c8d628-cba2-4541-81a5-86e9dcdeecbd
```

---

I need to try the same with Postgres and maybe Oracle
too

https://www.testcontainers.org/modules/databases/postgres/

`org.testcontainers:postgresql:1.14.3`

---

I'm going to be adding PostgreSQL Client library as a dependency. The
PostgreSQL JDBC Driver - https://github.com/pgjdbc/pgjdbc

https://search.maven.org/search?q=g:org.postgresql%20AND%20a:postgresql

https://search.maven.org/artifact/org.postgresql/postgresql

I'm getting the latest version. At the time of this writing it's `42.2.18` and
there are variations too in it.

Since I use gradle, I'm going to adding a dependency like this

```groovy
implementation 'org.postgresql:postgresql:42.2.18'
```

https://jdbc.postgresql.org/documentation/head/

https://jdbc.postgresql.org/documentation/head/intro.html

https://jdbc.postgresql.org/documentation/head/setup.html

https://jdbc.postgresql.org/documentation/head/use.html

https://jdbc.postgresql.org/documentation/head/load.html

https://jdbc.postgresql.org/documentation/head/connect.html

https://jdbc.postgresql.org/documentation/head/query.html

https://jdbc.postgresql.org/documentation/head/ds-ds.html#ds-example


