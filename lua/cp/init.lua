local M = {}

--- Handle java template injection
M.__handle_java = function()
  -- Get the directory where init.lua is located
  local source = debug.getinfo(1, "S").source:sub(2)
  local plugin_dir = vim.fn.fnamemodify(source, ":h")
  local template_path = plugin_dir .. "/Solution.java"

  -- Read the template file
  local template_lines = vim.fn.readfile(template_path)
  -- Replace the current buffer content with template
  vim.api.nvim_buf_set_lines(0, 0, -1, false, template_lines)

  -- Move cursor to specific position
  vim.api.nvim_win_set_cursor(0, { 123, 4 })
end

--- Setup function as per the requirement of lazy.nvim
M.setup = function()
  vim.api.nvim_create_user_command("Cp", function()
    -- Check if current file type is java
    local file_type = vim.bo.filetype

    if file_type == "java" then
      M.__handle_java()
    end
  end, {
    desc = "Populate current buffer with CP template",
  })
end

return M
