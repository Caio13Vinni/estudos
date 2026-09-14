FROM hexpm/elixir:1.18.2-erlang-27.3-debian-bookworm-20250224

# Instala dependencias do sistema e node/npm para assets
RUN apt-get update && apt-get install -y \
    build-essential \
    npm \
    git \
    inotify-tools \
    && rm -rf /var/lib/apt/lists/*

# Instala Hex e Rebar
RUN mix local.hex --force && \
    mix local.rebar --force

# Instala o gerador do Phoenix
RUN mix archive.install hex phx_new --force && \
    chmod -R 755 /root/.mix

WORKDIR /app

CMD ["mix", "phx.server"]