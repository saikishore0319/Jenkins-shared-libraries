def call(String frontend_tag, String backend_tag, String docker_user){
  sh """
      sed -i 's|image: ${docker_user}/techify-backend:.*|image: ${docker_user}/techify-backend:${backend_tag}'  docker-compose.yml
      sed -i 's|image: ${docker_user}/techify-frontend:.*|image: ${docker_user}/techify-frontend:${frontend_tag}'  docker-compose.yml
    """
}
