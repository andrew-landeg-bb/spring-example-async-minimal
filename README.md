# spring-example-async-minimal

Spring Example: minimal async processing

run with 

```shell
    mvn spring-boot:run
```

Keep an eye on the logs and do:
```shell
    curl http://localhost:8080/v1
```


typical log output:

```
[nio-8080-exec-1] com.example.asyncminimal.SimpleService   : Starting sync task
[nio-8080-exec-1] com.example.asyncminimal.SimpleService   : Completing sync task
[nio-8080-exec-1] c.example.asyncminimal.SimpleController  : web thread completing: completed-synchronously : completed in 3ms
[lTaskExecutor-1] c.example.asyncminimal.AsyncTaskService  : starting long running task
[lTaskExecutor-1] c.example.asyncminimal.AsyncTaskService  : long running task complete in 3001ms
```