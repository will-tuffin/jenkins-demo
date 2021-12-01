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
            scriptPath('jenkins/Jenkinsfile')
        }
    }
}