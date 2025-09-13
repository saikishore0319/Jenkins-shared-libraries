def call(){
  def versions = readYaml file: 'versions.yml'
  env.FRONTEND_TAG = versions.frontend.tag
  env.BACKEND_TAG = versions.backend.tag
  echo 'Building frontend with "${FRONTEND_TAG}" and backend with "${BACKEND_TAG}"'
}
