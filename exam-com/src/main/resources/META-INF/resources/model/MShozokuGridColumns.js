/**
 * 所属マスタグリッド定義
 */

let MShozokuGridColumns = [
    Column.refer('BUSHO_ID', Messages['MShozokuGrid.bushoId'], 150, 'primaryKey numbering', 'null'),
    Column.refer('SHOKUI_ID', Messages['MShozokuGrid.shokuiId'], 150, 'primaryKey numbering', 'null'),
    Column.refer('USER_ID', Messages['MShozokuGrid.userId'], 150, 'primaryKey numbering', 'null'),
    Column.date('KAISHI_BI', Messages['MShozokuGrid.kaishiBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.date('SHURYO_BI', Messages['MShozokuGrid.shuryoBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_DT', Messages['MShozokuGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MShozokuGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MShozokuGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MShozokuGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MShozokuGrid.deleteF'], 30, ''),
];
