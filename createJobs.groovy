pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('spring-boot-demo-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/will-tuffin/demo-spring-app.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}