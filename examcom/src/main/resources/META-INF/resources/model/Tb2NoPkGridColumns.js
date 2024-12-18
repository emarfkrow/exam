/**
 * 主キーなしグリッド定義
 */

let Tb2NoPkGridColumns = [
    Column.text('COLUMN_A', Messages['Tb2NoPkGrid.columnA'], 300, '', null),
    Column.text('COLUMN_B', Messages['Tb2NoPkGrid.columnB'], 300, '', null),
    Column.text('COLUMN_C', Messages['Tb2NoPkGrid.columnC'], 300, '', null),
    Column.text('COLUMN_D', Messages['Tb2NoPkGrid.columnD'], 300, '', null),
    Column.text('COLUMN_E', Messages['Tb2NoPkGrid.columnE'], 300, '', null),
    Column.cell('INSERT_TS', Messages['Tb2NoPkGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Tb2NoPkGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Tb2NoPkGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Tb2NoPkGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb2NoPkGrid.deleteF'], 30, ''),
];
