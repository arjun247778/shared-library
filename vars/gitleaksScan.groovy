def call() {
    echo "Running GitLeaks Scan..."

    sh '''
       gitleaks detect --source . -v || true
    '''
}