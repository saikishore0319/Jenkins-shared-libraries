def call(String container_name, String image_name, String port ){
   echo "deploying the code"
                sh """
                echo "stopping and removing the existing containers"
                docker rm -f ${container_name} || true
                
                echo "starting new container"
                docker run -d --name ${container_name} -p ${port}:${port} ${image_name}
                """
}
