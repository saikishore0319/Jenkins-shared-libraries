def call(){
   echo "deploying the code"
                sh '''
                echo "stopping and removing the existing containers"
                docker rm -f pythonapp_container || true
                
                echo "starting new container"
                docker run -d --name pythonapp_container -p 80:80 pythonapp
                '''
}
