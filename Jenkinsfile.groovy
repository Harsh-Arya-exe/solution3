pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
            echo 'Building...'
            echo 'P1.py'
            } 
        }
        stage('Test'){
            steps{
            echo 'Testing...'
            }
        }
        stage('Deploy'){
            steps{
            echo 'Deploy...'
            }
        }

    }
}