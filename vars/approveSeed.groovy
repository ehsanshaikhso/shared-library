def call(String scriptPath) {
    if (!fileExists(scriptPath)) {
        error "Seed script not found: ${scriptPath}"
    }
    echo "Seed script approved: ${scriptPath}"
}