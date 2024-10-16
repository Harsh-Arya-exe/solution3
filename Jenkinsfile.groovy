pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
            echo 'Building...'
            echo 'python3 P1.py'
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