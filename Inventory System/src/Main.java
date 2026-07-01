import java.util.Scanner;

import controller.AuthController;
import controller.CategoryController;
import controller.ItemController;
import controller.RoleController;
import controller.UnitController;

import models.Category;
import models.Item;
import models.Role;
import models.Unit;
import models.User;

import repository.CategoryRepository;
import repository.ItemRepository;
import repository.RoleRepository;
import repository.UnitRepository;
import repository.UserRepository;

import service.AuthService;
import service.CategoryService;
import service.ItemService;
import service.RoleService;
import service.UnitService;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Repository
        UserRepository userRepository = new UserRepository();
        ItemRepository itemRepository = new ItemRepository();
        CategoryRepository categoryRepository = new CategoryRepository();
        UnitRepository unitRepository = new UnitRepository();
        RoleRepository roleRepository = new RoleRepository();

        // Service
        AuthService authService = new AuthService(userRepository);
        ItemService itemService = new ItemService(itemRepository);
        CategoryService categoryService = new CategoryService(categoryRepository);
        UnitService unitService = new UnitService(unitRepository);
        RoleService roleService = new RoleService(roleRepository);

        // Controller
        AuthController authController = new AuthController(authService);
        ItemController itemController = new ItemController(itemService);
        CategoryController categoryController = new CategoryController(categoryService);
        UnitController unitController = new UnitController(unitService);
        RoleController roleController = new RoleController(roleService);


        // Login
        initializeData(userRepository);

        boolean isLoggedIn = login(authController, userRepository, input);

        if (!isLoggedIn) {
            input.close();
            return;
        }

        // Menu
        displayMainMenu(
                input,
                itemController,
                categoryController,
                unitController,
                roleController);

        input.close();
    }

    // LOGIN 

    
    public static boolean login(AuthController authController,
                                UserRepository userRepository,
                                Scanner input) {

       

        System.out.println("===== LOGIN =====");

        System.out.print("Username : ");
        String username = input.nextLine();

        System.out.print("Password : ");
        String password = input.nextLine();

        if (!authController.login(username, password)) {
            System.out.println("Login Gagal!");
            return false;
        }

        System.out.println("\nLogin Berhasil!");
        return true;
    }

    // inisiasi data
    public static void initializeData(UserRepository userRepository) {

        Role role = new Role(1, "Admin");

        User admin = new User(
                1,
                "Administrator",
                "admin",
                "P@ssword",
                role);

        userRepository.save(admin);
    }


    //  Menu utama

    public static void displayMainMenu(
        Scanner input,
        ItemController itemController,
        CategoryController categoryController,
        UnitController unitController,
        RoleController roleController) {

    int pilihan;

    do {

       System.out.println("\n===== INVENTORY SYSTEM =====");
        System.out.println("1. Manage Item");
        System.out.println("2. Manage Category");
        System.out.println("3. Manage Unit");
        System.out.println("4. Manage Role");
        System.out.println("5. Exit");
        System.out.print("Choose Menu : ");

        pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {

            case 1:
                displayItemMenu(input, itemController);
                break;

            case 2:
                displayCategoryMenu(input, categoryController);
                break;

            case 3:
                displayUnitMenu(input, unitController);
                break;

            case 4:
                displayRoleMenu(input, roleController);
                break;

            case 5:
                System.out.println("Terima kasih telah menggunakan Inventory System.");
                break;

            default:
                System.out.println("Menu tidak tersedia.");
        }

    } while (pilihan != 5);
}

// menu item
    public static void displayItemMenu(
            Scanner input,
            ItemController itemController) {

        int pilihan;

        do {

            System.out.println("\n===== ITEM MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Back");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("ID Barang : ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Barang : ");
                    String nama = input.nextLine();

                    System.out.print("Stock : ");
                    int stock = input.nextInt();

                    System.out.print("Harga Beli : ");
                    double hargaBeli = input.nextDouble();

                    System.out.print("Harga Jual : ");
                    double hargaJual = input.nextDouble();
                    input.nextLine();

                    Category category = new Category(1, "Makanan");
                    Unit unit = new Unit(1, "Pcs");

                    Item item = new Item(
                            id,
                            nama,
                            stock,
                            hargaBeli,
                            hargaJual,
                            category,
                            unit);

                    itemController.tambahItem(item);

                    System.out.println("Barang berhasil ditambahkan!");
                    break;

                case 2:

                    System.out.println("\n===== DAFTAR BARANG =====");

                    if (itemController.getAllItem().isEmpty()) {

                        System.out.println("Belum ada data barang.");

                    } else {

                        for (Item barang : itemController.getAllItem()) {

                            System.out.println("-----------------------------");
                            System.out.println("ID          : " + barang.getId());
                            System.out.println("Nama Barang : " + barang.getItemName());
                            System.out.println("Stock       : " + barang.getStock());
                            System.out.println("Harga Beli  : " + barang.getPurchasePrice());
                            System.out.println("Harga Jual  : " + barang.getSellingPrice());
                            System.out.println("Kategori    : " + barang.getCategory().getCategoryName());
                            System.out.println("Unit        : " + barang.getUnit().getUnitName());

                        }

                    }

                    break;

                case 3:

                    break;

                default:

                    System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 3);
    }

  // menu category
    public static void displayCategoryMenu(
            Scanner input,
            CategoryController categoryController) {

        int pilihan;

        do {

            System.out.println("\n===== CATEGORY MENU =====");
            System.out.println("1. Add Category");
            System.out.println("2. View Categories");
            System.out.println("3. Back");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("ID Category : ");
                    int categoryId = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Category : ");
                    String categoryName = input.nextLine();

                    Category newCategory = new Category(categoryId, categoryName);

                    categoryController.addCategory(newCategory);

                    System.out.println("Category berhasil ditambahkan!");
                    break;

                case 2:

                    System.out.println("\n===== DAFTAR CATEGORY =====");

                    if (categoryController.getAllCategory().isEmpty()) {

                        System.out.println("Belum ada data category.");

                    } else {

                        for (Category c : categoryController.getAllCategory()) {
                            System.out.println(c.getId() + " - " + c.getCategoryName());
                        }

                    }

                    break;

                case 3:

                    break;

                default:

                    System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 3);
    }

    public static void displayUnitMenu(
            Scanner input,
            UnitController unitController) {

        int pilihan;

        do {

            System.out.println("\n===== UNIT MENU =====");
            System.out.println("1. Add Unit");
            System.out.println("2. View Units");
            System.out.println("3. Back");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("ID Unit : ");
                    int unitId = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Unit : ");
                    String unitName = input.nextLine();

                    Unit newUnit = new Unit(unitId, unitName);

                    unitController.addUnit(newUnit);

                    System.out.println("Unit berhasil ditambahkan!");
                    break;

                case 2:

                    System.out.println("\n===== DAFTAR UNIT =====");

                    if (unitController.getAllUnits().isEmpty()) {

                        System.out.println("Belum ada data unit.");

                    } else {

                        for (Unit u : unitController.getAllUnits()) {
                            System.out.println(u.getId() + " - " + u.getUnitName());
                        }

                    }

                    break;

                case 3:

                    break;

                default:

                    System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 3);
    }


    public static void displayRoleMenu(
            Scanner input,
            RoleController roleController) {

        int pilihan;

        do {

           System.out.println("\n===== ROLE MENU =====");
            System.out.println("1. Add Role");
            System.out.println("2. View Roles");
            System.out.println("3. Back");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("ID Role : ");
                    int roleId = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Role : ");
                    String roleName = input.nextLine();

                    Role newRole = new Role(roleId, roleName);

                    roleController.addRole(newRole);

                    System.out.println("Role berhasil ditambahkan!");
                    break;

                case 2:

                    System.out.println("\n===== DAFTAR ROLE =====");

                    if (roleController.getAllRoles().isEmpty()) {

                        System.out.println("Belum ada data role.");

                    } else {

                        for (Role r : roleController.getAllRoles()) {
                            System.out.println(r.getId() + " - " + r.getRoleName());
                        }

                    }

                    break;

                case 3:

                    break;

                default:

                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 3);
    }

    }
