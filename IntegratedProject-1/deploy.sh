# Using a Seconds and Hour for versioning
date_str=$(date +%S%H | tr -d '\r')
date=$(echo "$date_str" | tr -d -c '[:alnum:]-')
echo "$date"
imageName="todo-image-$date"

echo "Starting Deployment"
echo "Building Docker Image with tag: $imageName"

# Corrected: Added a space between the tag and the build context '.'
docker image build -t "$imageName" .

# Corrected: Used the variable $imageName for both source and target tags
docker image tag "$imageName" "toobyloba/$imageName"

# Corrected: Fixed the typo in "Pushing"
echo "Pushing image to registry"

# Corrected: Used the variable $imageName
docker push "toobyloba/$imageName"
