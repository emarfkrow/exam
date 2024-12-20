/**
 * 所属マスタグリッド定義
 */

let MhrShozokuGridColumns = [
    Column.refer('BUSHO_ID', Messages['MhrShozokuGrid.bushoId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('SHOKUI_ID', Messages['MhrShozokuGrid.shokuiId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('USER_ID', Messages['MhrShozokuGrid.userId'], 80, 'primaryKey numbering', 'null'),
    Column.date('KAISHI_BI', Messages['MhrShozokuGrid.kaishiBi'], 80, 'primaryKey', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrShozokuGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.check('DELETE_F', Messages['MhrShozokuGrid.deleteF'], 30, ''),
];
