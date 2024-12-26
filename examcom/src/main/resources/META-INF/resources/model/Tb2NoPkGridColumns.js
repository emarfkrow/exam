/**
 * 主キーなしグリッド定義
 */

let Tb2NoPkGridColumns = [
    Column.text('COLUMN_A', Messages['Tb2NoPkGrid.columnA'], 300, 'primaryKey', null),
    Column.text('COLUMN_B', Messages['Tb2NoPkGrid.columnB'], 300, 'uniqueKey', null),
    Column.text('COLUMN_C', Messages['Tb2NoPkGrid.columnC'], 300, 'uniqueKey', null),
    Column.text('COLUMN_D', Messages['Tb2NoPkGrid.columnD'], 300, '', null),
    Column.text('COLUMN_E', Messages['Tb2NoPkGrid.columnE'], 300, '', null),
    Column.check('DELETE_F', Messages['Tb2NoPkGrid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['Tb2NoPkGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
