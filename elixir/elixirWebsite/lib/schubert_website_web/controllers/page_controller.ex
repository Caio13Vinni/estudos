defmodule SchubertWebsiteWeb.PageController do
  use SchubertWebsiteWeb, :controller

  def home(conn, _params) do
    render(conn, :home)
  end
end
