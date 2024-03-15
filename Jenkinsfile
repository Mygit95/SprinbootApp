pipeline
{
    agent any

       stage('Build')
        {
           steps {
               script {
                   def mvnHome = tool 'Maven'
                   sh "${mvnHome}/bin/mvn clean install"
                   echo 'Build Successful'
               }
           }
       }

        stage('Test')
        {
            steps
            {
                echo 'Test App'
            }
        }

        stage('Deploy')
        {
            steps
            {
                echo 'Deploy App'
            }
        }
    }

    post
    {

    	always
    	{
    		emailext body: 'Summary', subject: 'Pipeline Status', to: 'ahiwaleashish95@gmail.com'
    	}

    }
}
