# Deploy to Kubernetes
kubectl apply -f inventory-microservice-k8.yaml
echo ">> applied kubernetes config file"

# Re-assign the images version to Kubernetes PODs so that the POD re-deploys with latest image
kubectl set image deployments/inventory-microservice-deployment inventory-microservice=aakashkumar1980/inventory-microservice:$GIT_SHA
echo ">> set the container image tag to:"$GIT_SHA