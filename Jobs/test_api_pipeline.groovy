node {
    stage('Checkout') {      
       checkout([$class: 'GitSCM', branches: [[name: '*/master']],
        userRemoteConfigs: [[url: 'https://github.com/rohitss912/springboot.git', credentialsId : 'credentialsId']]])
    }

    stage('Build'){
        sh "mvn clean package"
    }
}