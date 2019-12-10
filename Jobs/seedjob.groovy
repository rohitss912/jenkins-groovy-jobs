listView('spring-boot'){
    description('Jobs for Spring Boot APIs')
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
    jobs{
        name('test-api')
    }
}