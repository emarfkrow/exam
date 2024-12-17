/**
 * 所属マスタグリッド定義
 */

let MhrShozokuGridColumns = [
    Column.refer('BUSHO_ID', Messages['MhrShozokuGrid.bushoId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('SHOKUI_ID', Messages['MhrShozokuGrid.shokuiId'], 80, 'primaryKey numbering', 'null'),
    Column.refer('USER_ID', Messages['MhrShozokuGrid.userId'], 80, 'primaryKey numbering', 'null'),
    Column.date('KAISHI_BI', Messages['MhrShozokuGrid.kaishiBi'], 80, 'primaryKey', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrShozokuGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_DT', Messages['MhrShozokuGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MhrShozokuGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MhrShozokuGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MhrShozokuGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MhrShozokuGrid.deleteF'], 30, ''),
];
