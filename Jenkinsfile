pipeline {
   agent any

   stages {
      stage('git checkout') {
          steps{
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '1372feaf-d4d3-4b15-bb45-2fcb14d5ea30', url: 'https://github.com/kangxuezhong/githubdemo.git']]])
          }
      }
      stage('hello world'){
          steps{
              echo 'Hello World'
          } 
      }
   }
}