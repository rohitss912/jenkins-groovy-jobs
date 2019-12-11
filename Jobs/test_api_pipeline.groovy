node {
    stage('Checkout') {      
       checkout([$class: 'GitSCM', branches: [[name: '*/master']],
        userRemoteConfigs: [[url: 'https://github.com/rohitss912/springboot.git', credentialsId : 'credentialsId']]])
    }

    stage('Build'){
        bat "mvn clean package"
    }
}