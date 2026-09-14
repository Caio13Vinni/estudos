.PHONY: help build up down logs shell init init_step1 init_step2 init_step3 get_deps serve fix_permissions

UID = $(shell id -u)
GID = $(shell id -g)

help: ## Show help
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ".*?## "}; {printf "\033[36m %-30s\033[0m %s\n", $$1, $$2}'

build: ## Build the Docker image 
	docker compose build

up: ## Start the Docker containers
	docker compose up -d

down: ## Stop the Docker containers 
	docker compose down

logs: ## Tail the Docker logs
	docker compose logs -f

shell: ## Start a shell in the Docker container 
	docker compose exec app bash

init_step1: ## Create a new Phoenix project
	docker compose run --rm app mix phx.new . --app schubert_website --database postgres

init_step2: ## Download dependencies
	docker compose run --rm app mix deps.get

init_step3: ## Create database
	docker compose run --rm app mix ecto.create

init: init_step1 fix_permissions init_step2 init_step3 ## Initialize a new project

get_deps: ## Download dependencies
	docker compose run --rm app mix deps.get

serve: ## Start the Phoenix server
	docker compose up

fix_permissions: ## Fix permissions for Linux users
	@echo "Fixing file permissions..." 
	@sudo chown -R $(UID):$(GID) . 
	@sudo chmod -R u+rw .
	@echo "Done."