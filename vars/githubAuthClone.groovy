def call(String url, String branch, String CredId) {
git(
       branch: branch,
        url: url,
        credentialsId: CredID
   )
}
