pipelineJob('test-api-job'){
    logRotator(30, -1, 1, -1)
     definition {
        cps {
            script(readFileFromWorkspace('Jobs/test_api_pipeline.groovy'))
            sandbox()
        }
    }
}