defmodule SchubertWebsite.Repo do
  use Ecto.Repo,
    otp_app: :schubert_website,
    adapter: Ecto.Adapters.Postgres
end
